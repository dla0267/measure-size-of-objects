package y2.spring.insurancesystem.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class AddressForm {
  @Id
  private String id;

  private String address;
  private String city;
  private String state;
  private String country;
  private Integer zipCode;


  public AddressForm(String address, String city, String state, String country, Integer zipCode) {

    this.address = address;
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipCode = zipCode;
  }

  public String getId() {
    return this.id;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }
}
