package net.simplifiedlearning.volleymysqlexample;

/**

 */

public class Product {
    private int id;
    private String city_of_service;
    private String service_engg_name;
    private String cust_name;
    private String cust_address;
    private int cust_contact_no;
    private String cust_email_id;

    public Product(int id, String city_of_service, String service_engg_name, String cust_name, String cust_address,int cust_contact_no,  String cust_email_id) {
        this.id = id;
        this.city_of_service = city_of_service;
        this.service_engg_name = service_engg_name;
        this.cust_name = cust_name;
        this.cust_address = cust_address;
        this.cust_contact_no = cust_contact_no;
        this.cust_email_id = cust_email_id;
    }

    public int getId() {
        return id;
    }

    public String getCity_of_service() {
        return city_of_service;
    }

    public String getService_engg_name() {
        return service_engg_name;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getCust_address() {
        return cust_address;
    }

    public int getCust_contact_no() { return cust_contact_no; }
    public String getCust_email_id() { return cust_email_id; }
}
