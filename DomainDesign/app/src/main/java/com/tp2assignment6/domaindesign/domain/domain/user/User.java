package com.tp2assignment6.domaindesign.domain.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/18.
 */
public class User implements Serializable {
    private Long idNumber;
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;

    public User() {
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public User(Builder builder){
        this.idNumber = builder.idNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.email = builder.email;
    }

    public static class Builder{
        private Long idNumber;
        private String firstName;
        private String lastName;
        private Date dob;
        private String email;
        public Builder idNumber(Long value) {
            this.idNumber = value;
            return this;
        }

        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        public Builder dob(Date value){
            this.dob = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder copy(User value){
            this.idNumber = value.idNumber;
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.dob = value.dob;
            this.email = value.email;
            return this;
        }

        public User build(){return new User(this);}
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;

        return idNumber != null ? idNumber.equals(user.idNumber) : user.idNumber == null;
    }

    public int hashCode() {
        return idNumber != null ? idNumber.hashCode() : 0;
    }
}
