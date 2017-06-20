package com.br.kodamalabs.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estudio")
public class Estudio implements Serializable {

    private static final long serialVersionUID = 201706081L;

    @Id
    private String id;

    private String name;

    private String description;

    private Double pricePerHour;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pricePerHour == null) ? 0 : pricePerHour.hashCode());
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
        Estudio other = (Estudio) obj;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (pricePerHour == null) {
            if (other.pricePerHour != null)
                return false;
        } else if (!pricePerHour.equals(other.pricePerHour))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Estudio [");
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
        if (description != null) {
            builder.append("description: ");
            builder.append(description);
            builder.append(" | ");
        }
        if (pricePerHour != null) {
            builder.append("pricePerHour: ");
            builder.append(pricePerHour);
        }
        builder.append("]");
        return builder.toString();
    }

}
