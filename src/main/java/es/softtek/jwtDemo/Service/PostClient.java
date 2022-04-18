package es.softtek.jwtDemo.Service;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

public class PostClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String organisation;
    private String tradeName;
    private String address;
    private String sector;
    private String AccountManager; //manager-commercial
    private String firstContactUser;
    @Email
    private String firstContactEmail;
    private String firstContactPhone;
    private String note;
    private boolean active = true;

    public PostClient(Long id, String organisation, String tradeName, String address, String sector, String accountManager, String firstContactUser, String firstContactEmail, String firstContactPhone, String note, boolean active) {
        this.id = id;
        this.organisation = organisation;
        this.tradeName = tradeName;
        this.address = address;
        this.sector = sector;
        AccountManager = accountManager;
        this.firstContactUser = firstContactUser;
        this.firstContactEmail = firstContactEmail;
        this.firstContactPhone = firstContactPhone;
        this.note = note;
        this.active = active;
    }
    public PostClient(String organisation, String tradeName, String address, String sector, String accountManager, String firstContactUser, String firstContactEmail, String firstContactPhone, String note, boolean active) {
        this.organisation = organisation;
        this.tradeName = tradeName;
        this.address = address;
        this.sector = sector;
        AccountManager = accountManager;
        this.firstContactUser = firstContactUser;
        this.firstContactEmail = firstContactEmail;
        this.firstContactPhone = firstContactPhone;
        this.note = note;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getAccountManager() {
        return AccountManager;
    }

    public void setAccountManager(String accountManager) {
        AccountManager = accountManager;
    }

    public String getFirstContactUser() {
        return firstContactUser;
    }

    public void setFirstContactUser(String firstContactUser) {
        this.firstContactUser = firstContactUser;
    }

    public String getFirstContactEmail() {
        return firstContactEmail;
    }

    public void setFirstContactEmail(String firstContactEmail) {
        this.firstContactEmail = firstContactEmail;
    }

    public String getFirstContactPhone() {
        return firstContactPhone;
    }

    public void setFirstContactPhone(String firstContactPhone) {
        this.firstContactPhone = firstContactPhone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}