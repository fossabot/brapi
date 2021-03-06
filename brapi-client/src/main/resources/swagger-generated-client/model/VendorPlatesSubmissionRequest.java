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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.VendorOrderRequestPlates;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Request object structure to submit plate data to a vendor
 */
@Schema(description = "Request object structure to submit plate data to a vendor")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class VendorPlatesSubmissionRequest {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("numberOfSamples")
  private Integer numberOfSamples = null;

  @SerializedName("plates")
  private List<VendorOrderRequestPlates> plates = null;

  /**
   * The type of Samples being submitted
   */
  @JsonAdapter(SampleTypeEnum.Adapter.class)
  public enum SampleTypeEnum {
    DNA("DNA"),
    RNA("RNA"),
    TISSUE("Tissue");

    private String value;

    SampleTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SampleTypeEnum fromValue(String text) {
      for (SampleTypeEnum b : SampleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SampleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SampleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SampleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SampleTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("sampleType")
  private SampleTypeEnum sampleType = null;

  public VendorPlatesSubmissionRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the contract, billing, and contact info.
   * @return clientId
  **/
  @Schema(description = "A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the contract, billing, and contact info.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public VendorPlatesSubmissionRequest numberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
    return this;
  }

   /**
   * The total number of samples contained in this request. Used for billing and basic validation of the request.
   * @return numberOfSamples
  **/
  @Schema(description = "The total number of samples contained in this request. Used for billing and basic validation of the request.")
  public Integer getNumberOfSamples() {
    return numberOfSamples;
  }

  public void setNumberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
  }

  public VendorPlatesSubmissionRequest plates(List<VendorOrderRequestPlates> plates) {
    this.plates = plates;
    return this;
  }

  public VendorPlatesSubmissionRequest addPlatesItem(VendorOrderRequestPlates platesItem) {
    if (this.plates == null) {
      this.plates = new ArrayList<VendorOrderRequestPlates>();
    }
    this.plates.add(platesItem);
    return this;
  }

   /**
   * Array of new plates to be submitted to a vendor
   * @return plates
  **/
  @Schema(description = "Array of new plates to be submitted to a vendor")
  public List<VendorOrderRequestPlates> getPlates() {
    return plates;
  }

  public void setPlates(List<VendorOrderRequestPlates> plates) {
    this.plates = plates;
  }

  public VendorPlatesSubmissionRequest sampleType(SampleTypeEnum sampleType) {
    this.sampleType = sampleType;
    return this;
  }

   /**
   * The type of Samples being submitted
   * @return sampleType
  **/
  @Schema(description = "The type of Samples being submitted")
  public SampleTypeEnum getSampleType() {
    return sampleType;
  }

  public void setSampleType(SampleTypeEnum sampleType) {
    this.sampleType = sampleType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorPlatesSubmissionRequest vendorPlatesSubmissionRequest = (VendorPlatesSubmissionRequest) o;
    return Objects.equals(this.clientId, vendorPlatesSubmissionRequest.clientId) &&
        Objects.equals(this.numberOfSamples, vendorPlatesSubmissionRequest.numberOfSamples) &&
        Objects.equals(this.plates, vendorPlatesSubmissionRequest.plates) &&
        Objects.equals(this.sampleType, vendorPlatesSubmissionRequest.sampleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, numberOfSamples, plates, sampleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlatesSubmissionRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    numberOfSamples: ").append(toIndentedString(numberOfSamples)).append("\n");
    sb.append("    plates: ").append(toIndentedString(plates)).append("\n");
    sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
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
