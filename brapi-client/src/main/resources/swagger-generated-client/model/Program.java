/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Program
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class Program {
  @SerializedName("abbreviation")
  private String abbreviation = null;

  @SerializedName("commonCropName")
  private String commonCropName = null;

  @SerializedName("documentationURL")
  private String documentationURL = null;

  @SerializedName("leadPerson")
  private String leadPerson = null;

  @SerializedName("leadPersonDbId")
  private String leadPersonDbId = null;

  @SerializedName("leadPersonName")
  private String leadPersonName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("objective")
  private String objective = null;

  @SerializedName("programDbId")
  private String programDbId = null;

  @SerializedName("programName")
  private String programName = null;

  public Program abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * An abbreviation which represnts this program
   * @return abbreviation
  **/
  @Schema(description = "An abbreviation which represnts this program")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Program commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

   /**
   * Common name for the crop which this program is for
   * @return commonCropName
  **/
  @Schema(description = "Common name for the crop which this program is for")
  public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public Program documentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
    return this;
  }

   /**
   * A URL to the human readable documentation of this object
   * @return documentationURL
  **/
  @Schema(description = "A URL to the human readable documentation of this object")
  public String getDocumentationURL() {
    return documentationURL;
  }

  public void setDocumentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
  }

  public Program leadPerson(String leadPerson) {
    this.leadPerson = leadPerson;
    return this;
  }

   /**
   * DEPRECATED in v1.3 - see \&quot;leadPersonName\&quot; or \&quot;leadPersonDbId\&quot;
   * @return leadPerson
  **/
  @Schema(description = "DEPRECATED in v1.3 - see \"leadPersonName\" or \"leadPersonDbId\"")
  public String getLeadPerson() {
    return leadPerson;
  }

  public void setLeadPerson(String leadPerson) {
    this.leadPerson = leadPerson;
  }

  public Program leadPersonDbId(String leadPersonDbId) {
    this.leadPersonDbId = leadPersonDbId;
    return this;
  }

   /**
   * The unique identifier of the program leader
   * @return leadPersonDbId
  **/
  @Schema(description = "The unique identifier of the program leader")
  public String getLeadPersonDbId() {
    return leadPersonDbId;
  }

  public void setLeadPersonDbId(String leadPersonDbId) {
    this.leadPersonDbId = leadPersonDbId;
  }

  public Program leadPersonName(String leadPersonName) {
    this.leadPersonName = leadPersonName;
    return this;
  }

   /**
   * The name of the program leader
   * @return leadPersonName
  **/
  @Schema(description = "The name of the program leader")
  public String getLeadPersonName() {
    return leadPersonName;
  }

  public void setLeadPersonName(String leadPersonName) {
    this.leadPersonName = leadPersonName;
  }

  public Program name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DEPRECATED in v1.3 - Use \&quot;programName\&quot;
   * @return name
  **/
  @Schema(description = "DEPRECATED in v1.3 - Use \"programName\"")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Program objective(String objective) {
    this.objective = objective;
    return this;
  }

   /**
   * The primary objective of the program
   * @return objective
  **/
  @Schema(description = "The primary objective of the program")
  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }

  public Program programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

   /**
   * The ID which uniquely identifies the program
   * @return programDbId
  **/
  @Schema(description = "The ID which uniquely identifies the program")
  public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public Program programName(String programName) {
    this.programName = programName;
    return this;
  }

   /**
   * Human readable name of the program
   * @return programName
  **/
  @Schema(description = "Human readable name of the program")
  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.abbreviation, program.abbreviation) &&
        Objects.equals(this.commonCropName, program.commonCropName) &&
        Objects.equals(this.documentationURL, program.documentationURL) &&
        Objects.equals(this.leadPerson, program.leadPerson) &&
        Objects.equals(this.leadPersonDbId, program.leadPersonDbId) &&
        Objects.equals(this.leadPersonName, program.leadPersonName) &&
        Objects.equals(this.name, program.name) &&
        Objects.equals(this.objective, program.objective) &&
        Objects.equals(this.programDbId, program.programDbId) &&
        Objects.equals(this.programName, program.programName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, commonCropName, documentationURL, leadPerson, leadPersonDbId, leadPersonName, name, objective, programDbId, programName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    leadPerson: ").append(toIndentedString(leadPerson)).append("\n");
    sb.append("    leadPersonDbId: ").append(toIndentedString(leadPersonDbId)).append("\n");
    sb.append("    leadPersonName: ").append(toIndentedString(leadPersonName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
