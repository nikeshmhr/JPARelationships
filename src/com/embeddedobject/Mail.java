package com.embeddedobject;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "EMBEDDED_MAIL")
public class Mail implements Serializable {

    @Id
    @Column(name = "MAIL_ID")
    private long id;

    @Column(name = "MAIN_BODY")
    private String mailBody;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "country", column = @Column(name = "ADD_COUNTRY")),
        @AttributeOverride(name = "city", column = @Column(name = "ADD_CITY")),
        @AttributeOverride(name = "street", column = @Column(name = "ADD_STREET"))
    })
    private Address mailAddress;

    public Mail() {
    }

    public Mail(String body, Address address) {
        this.mailBody = body;
        this.mailAddress = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public Address getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(Address mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "Mail{" + "id=" + id + ", mailBody=" + mailBody + ", mailAddress=" + mailAddress + '}';
    }

}
