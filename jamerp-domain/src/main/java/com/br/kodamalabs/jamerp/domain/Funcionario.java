package com.br.kodamalabs.jamerp.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 201706081L;

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;

    private String phone;

    private Date birthDate;

    private Permission permission;

    private String urlImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((permission == null) ? 0 : permission.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((urlImage == null) ? 0 : urlImage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (permission != other.permission)
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (urlImage == null) {
            if (other.urlImage != null)
                return false;
        } else if (!urlImage.equals(other.urlImage))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Funcionario [");
        if (id != null) {
            builder.append("id: ");
            builder.append(id);
            builder.append(" | ");
        }
        if (name != null) {
            builder.append("name: ");
            builder.append(name);
            builder.append(" | ");
        }
        if (lastName != null) {
            builder.append("lastName: ");
            builder.append(lastName);
            builder.append(" | ");
        }
        if (email != null) {
            builder.append("email: ");
            builder.append(email);
            builder.append(" | ");
        }
        if (phone != null) {
            builder.append("phone: ");
            builder.append(phone);
            builder.append(" | ");
        }
        if (birthDate != null) {
            builder.append("birthDate: ");
            builder.append(birthDate);
            builder.append(" | ");
        }
        if (permission != null) {
            builder.append("permission: ");
            builder.append(permission);
            builder.append(" | ");
        }
        if (urlImage != null) {
            builder.append("urlImage: ");
            builder.append(urlImage);
        }
        builder.append("]");
        return builder.toString();
    }

}
