/*
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.github.tobiasbriones.ep.northwind.model.model.supplier;

// Notice that Customer and Employee and Supplier and Shipper are the exact same
// model ...

/**
 * Defines a SupplierBuilder pattern for the {@link Supplier} model.
 */
public final class SupplierBuilder {

    private final int id;
    private String company;
    private String lastName;
    private String firstName;
    private String email;
    private String jobTitle;
    private String businessPhone;
    private String homePhone;
    private String mobilePhone;
    private String faxNumber;
    private String address;
    private String city;
    private String stateProvince;
    private String zipPostalCode;
    private String countryRegion;
    private String webPage;
    private String notes;
    private String attachments;

    public SupplierBuilder(int id) {
        this.id = id;
        company = "";
        lastName = "";
        firstName = "";
        email = "";
        jobTitle = "";
        businessPhone = "";
        homePhone = "";
        mobilePhone = "";
        faxNumber = "";
        address = "";
        city = "";
        stateProvince = "";
        zipPostalCode = "";
        countryRegion = "";
        webPage = "";
        notes = "";
        attachments = "";
    }

    //                                                                        //
    //                      ACCESSOR AND MUTATOR METHODS                      //
    //                                                                        //

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public SupplierBuilder setCompany(String value) {
        company = value;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public SupplierBuilder setLastName(String value) {
        lastName = value;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public SupplierBuilder setFirstName(String value) {
        firstName = value;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SupplierBuilder setEmail(String value) {
        email = value;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public SupplierBuilder setJobTitle(String value) {
        jobTitle = value;
        return this;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public SupplierBuilder setBusinessPhone(String value) {
        businessPhone = value;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public SupplierBuilder setHomePhone(String value) {
        homePhone = value;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public SupplierBuilder setMobilePhone(String value) {
        mobilePhone = value;
        return this;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public SupplierBuilder setFaxNumber(String value) {
        faxNumber = value;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public SupplierBuilder setAddress(String value) {
        address = value;
        return this;
    }

    public String getCity() {
        return city;
    }

    public SupplierBuilder setCity(String value) {
        city = value;
        return this;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public SupplierBuilder setStateProvince(String value) {
        stateProvince = value;
        return this;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public SupplierBuilder setZipPostalCode(String value) {
        zipPostalCode = value;
        return this;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public SupplierBuilder setCountryRegion(String value) {
        countryRegion = value;
        return this;
    }

    public String getWebPage() {
        return webPage;
    }

    public SupplierBuilder setWebPage(String value) {
        webPage = value;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public SupplierBuilder setNotes(String value) {
        notes = value;
        return this;
    }

    public String getAttachments() {
        return attachments;
    }

    public SupplierBuilder setAttachments(String value) {
        attachments = value;
        return this;
    }
    //                  END OF ACCESSOR AND MUTATOR METHODS                   //

    @Override
    public String toString() {
        return "SupplierBuilder[" +
               "id=" + id + ", " +
               "company=" + company + ", " +
               "lastName=" + lastName + ", " +
               "firstName=" + firstName + ", " +
               "email=" + email + ", " +
               "jobTitle=" + jobTitle + ", " +
               "businessPhone=" + businessPhone + ", " +
               "homePhone=" + homePhone + ", " +
               "mobilePhone=" + mobilePhone + ", " +
               "faxNumber=" + faxNumber + ", " +
               "address=" + address + ", " +
               "city=" + city + ", " +
               "stateProvince=" + stateProvince + ", " +
               "zipPostalCode=" + zipPostalCode + ", " +
               "countryRegion=" + countryRegion + ", " +
               "webPage=" + webPage + ", " +
               "notes=" + notes + ", " +
               "attachments=" + attachments + ", " +
               "]";
    }

    public Supplier build() {
        return new Supplier(
            id,
            company,
            lastName,
            firstName,
            email,
            jobTitle,
            businessPhone,
            homePhone,
            mobilePhone,
            faxNumber,
            address,
            city,
            stateProvince,
            zipPostalCode,
            countryRegion,
            webPage,
            notes,
            attachments
        );
    }

}