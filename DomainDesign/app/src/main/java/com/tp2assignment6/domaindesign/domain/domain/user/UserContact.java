package com.tp2assignment6.domaindesign.domain.domain.user;

import java.io.Serializable;

/**
 * Created by NXA-C.unltd on 2016/04/18.
 */
public class UserContact implements Serializable {
    private Long idNumber;
    private String contactType;
    private String contactValue;
    private String contactStatus;

    public UserContact() {
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public String getContactType() {
        return contactType;
    }

    public String getContactValue() {
        return contactValue;
    }

    public String getContactStatus() {
        return contactStatus;
    }

    public UserContact(Builder builder){
        this.idNumber = builder.idNumber;
        this.contactType = builder.contactType;
        this.contactValue = builder.contactValue;
        this.contactStatus = builder.contactStatus;
    }

    public static class Builder{
        private Long idNumber;
        private String contactType;
        private String contactValue;
        private String contactStatus;

        public Builder idNumber(Long value){
            this.idNumber = value;
            return this;
        }

        public Builder contactType(String value){
            this.contactType = value;
            return this;
        }

        public Builder contactValue(String value){
            this.contactValue = value;
            return this;
        }

        public Builder contactStatus(String value){
            this.contactStatus = value;
            return this;
        }

        public Builder copy(UserContact value){
            this.idNumber = value.idNumber;
            this.contactType = value.contactType;
            this.contactValue = value.contactValue;
            this.contactStatus = value.contactStatus;
            return this;
        }

        public UserContact build(){return new UserContact(this);}
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        UserContact that = (UserContact) obj;

        return idNumber.equals(that.idNumber);
    }

    @Override
    public int hashCode() {return idNumber.hashCode();}
}
