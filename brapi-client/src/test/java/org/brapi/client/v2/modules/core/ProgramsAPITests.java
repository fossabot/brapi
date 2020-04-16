package org.brapi.client.v2.modules.core;

import lombok.SneakyThrows;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramsAPITests extends BrAPIClientTest {

    //TODO: Maybe query these before tests instead of hard coding.
    private String programId = "program3";
    private String externalReferenceID = "https://brapi.org/specification";

    private ProgramsAPI programsAPI = new ProgramsAPI(this.client);

    @Test
    @SneakyThrows
    public void getProgramsSuccess() {
        List<BrApiProgram> programs = this.programsAPI.getPrograms();

        assertEquals(true, !programs.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        Optional<BrApiProgram> program = this.programsAPI.getProgramById(this.programId);

        assertEquals(true, program.isPresent(), "Program was not returned");

        // Check the response was parsed correctly.
        BrApiProgram brApiProgram = program.get();
        assertEquals(true, brApiProgram.getAbbreviation() != null, "Abbreviation was not populated");
        assertEquals(true, brApiProgram.getAdditionalInfo() != null, "Additional Info was not populated");
        assertEquals(true, brApiProgram.getAdditionalInfo().size() > 0, "Additional Info had no entries");
        assertEquals(true, brApiProgram.getCommonCropName() != null, "Common crop name was not populated");
        assertEquals(true, brApiProgram.getDocumentationURL() != null, "Documentation url was not populated");
        assertEquals(true, brApiProgram.getExternalReferences() != null, "External references were not populated");
        assertEquals(true, brApiProgram.getExternalReferences().get(0).getReferenceSource() != null, "Reference source was not populated");
        assertEquals(true, brApiProgram.getExternalReferences().get(0).getReferenceID() != null, "Reference Id was not populated");
        assertEquals(true, brApiProgram.getLeadPersonDbId() != null, "Lead person id was not populated");
        assertEquals(true, brApiProgram.getLeadPersonName() != null, "Lead person name were not populated");
        assertEquals(true, brApiProgram.getObjective() != null, "Objective was not populated");
        assertEquals(true, brApiProgram.getProgramDbId() != null, "Program DbId was not populated");
        assertEquals(true, brApiProgram.getProgramName() != null, "Program name was not populated");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdMissingID() {

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiProgram> program = this.programsAPI.getProgramById("does not exist");
        });

        // Check out return message is returned
        String errorMsg = exception.getMessage();
        assertEquals(true, errorMsg.length() > 0, "Error message was not returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDSuccess() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID(this.externalReferenceID)
                .build();

        List<BrApiProgram> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() > 0, "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        List<BrApiProgram> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() == 0, "List of programs was not empty");
    }

    @Test
    @SneakyThrows
    public void createProgramSuccess() {

        BrApiProgram brApiProgram = BrApiProgram.builder()
                .programName("new test program")
                .build();

        Optional<BrApiProgram> createdProgram = this.programsAPI.createProgram(brApiProgram);

        assertEquals(true, createdProgram.isPresent());
        BrApiProgram program = createdProgram.get();
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
        assertEquals("new test program", program.getProgramName() , "Program Name was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createMultipleProgramsSuccess() {

        BrApiProgram brApiProgram1 = BrApiProgram.builder()
                .programName("test1")
                .build();
        BrApiProgram brApiProgram2 = BrApiProgram.builder()
                .programName("test2")
                .build();
        List<BrApiProgram> brApiPrograms = new ArrayList<>();
        brApiPrograms.add(brApiProgram1);
        brApiPrograms.add(brApiProgram2);

        List<BrApiProgram> createdPrograms = this.programsAPI.createPrograms(brApiPrograms);

        assertEquals(true, createdPrograms.size() == 2);
        assertEquals("test1", createdPrograms.get(0).getProgramName(), "Sent name and returned program name does not match");
        assertEquals(true, createdPrograms.get(0).getProgramDbId() != null, "Program Id was not parsed properly");
        assertEquals("test2", createdPrograms.get(1).getProgramName(), "Sent name and returned program name does not match");
        assertEquals(true, createdPrograms.get(1).getProgramDbId() != null, "Program Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createProgramIdPresentFailure() {

        BrApiProgram brApiProgram = BrApiProgram.builder()
                .programName("new test program")
                .programDbId("id1123")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiProgram> createdProgram = this.programsAPI.createProgram(brApiProgram);
        });
    }

    @Test
    @SneakyThrows
    public void createProgramEmptyProgramSuccess() {
        BrApiProgram brApiProgram = new BrApiProgram();
        Optional<BrApiProgram> createdProgram = this.programsAPI.createProgram(brApiProgram);

        assertEquals(true, createdProgram.isPresent());
        BrApiProgram program = createdProgram.get();
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
    }

}
