/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Esteban Bv  // se  crea un objeto de tipo classess este objeto corresponde a cada uno de los usuarios de la busqueda
 * en la base de datos
 */
public class classess {
    int id;
    String named;
    String postalZip;
    String phone;
    String address;
    String country;
    String currency;
    String alphanumeric;
    int numberrange;
    String region;
    String text;
    String email;
    String list;

    public classess(int id, String named, String postalZip, String phone, String address, String country, String currency, String alphanumeric, int numberrange, String region, String text, String email, String list) {
        this.id = id;
        this.named = named;
        this.postalZip = postalZip;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.currency = currency;
        this.alphanumeric = alphanumeric;
        this.numberrange = numberrange;
        this.region = region;
        this.text = text;
        this.email = email;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public void setPostalZip(String postalZip) {
        this.postalZip = postalZip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAlphanumeric() {
        return alphanumeric;
    }

    public void setAlphanumeric(String alphanumeric) {
        this.alphanumeric = alphanumeric;
    }

    public int getNumberrange() {
        return numberrange;
    }

    public void setNumberrange(int numberrange) {
        this.numberrange = numberrange;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
        
}
