package com.br.kodamalabs.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "agendamento")
public class Agendamento implements Serializable {

    private static final long serialVersionUID = 201706081L;

    @Id
    private Long id;

    private String client;

    private String phoneClient;

    private String emailClient;

    private Estudio estudio;

    private List<Produtos> products;

    private Date scheduleDate;

    private Integer startTime;

    private Integer endTime;

    private Integer amountOfHours;

    private Double totalPrice;

    private Funcionario funcionario;

    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public List<Produtos> getProducts() {
        return products;
    }

    public void setProducts(List<Produtos> products) {
        this.products = products;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(Integer amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((amountOfHours == null) ? 0 : amountOfHours.hashCode());
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((emailClient == null) ? 0 : emailClient.hashCode());
        result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
        result = prime * result + ((estudio == null) ? 0 : estudio.hashCode());
        result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((phoneClient == null) ? 0 : phoneClient.hashCode());
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + ((scheduleDate == null) ? 0 : scheduleDate.hashCode());
        result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
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
        Agendamento other = (Agendamento) obj;
        if (amountOfHours == null) {
            if (other.amountOfHours != null)
                return false;
        } else if (!amountOfHours.equals(other.amountOfHours))
            return false;
        if (client == null) {
            if (other.client != null)
                return false;
        } else if (!client.equals(other.client))
            return false;
        if (emailClient == null) {
            if (other.emailClient != null)
                return false;
        } else if (!emailClient.equals(other.emailClient))
            return false;
        if (endTime == null) {
            if (other.endTime != null)
                return false;
        } else if (!endTime.equals(other.endTime))
            return false;
        if (estudio == null) {
            if (other.estudio != null)
                return false;
        } else if (!estudio.equals(other.estudio))
            return false;
        if (funcionario == null) {
            if (other.funcionario != null)
                return false;
        } else if (!funcionario.equals(other.funcionario))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (phoneClient == null) {
            if (other.phoneClient != null)
                return false;
        } else if (!phoneClient.equals(other.phoneClient))
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (scheduleDate == null) {
            if (other.scheduleDate != null)
                return false;
        } else if (!scheduleDate.equals(other.scheduleDate))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        } else if (!startTime.equals(other.startTime))
            return false;
        if (status != other.status)
            return false;
        if (totalPrice == null) {
            if (other.totalPrice != null)
                return false;
        } else if (!totalPrice.equals(other.totalPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Agendamento [");
        if (id != null) {
            builder.append("id: ");
            builder.append(id);
            builder.append(" | ");
        }
        if (client != null) {
            builder.append("client: ");
            builder.append(client);
            builder.append(" | ");
        }
        if (phoneClient != null) {
            builder.append("phoneClient: ");
            builder.append(phoneClient);
            builder.append(" | ");
        }
        if (emailClient != null) {
            builder.append("emailClient: ");
            builder.append(emailClient);
            builder.append(" | ");
        }
        if (estudio != null) {
            builder.append("estudio: ");
            builder.append(estudio);
            builder.append(" | ");
        }
        if (products != null) {
            builder.append("products: ");
            builder.append(products);
            builder.append(" | ");
        }
        if (scheduleDate != null) {
            builder.append("scheduleDate: ");
            builder.append(scheduleDate);
            builder.append(" | ");
        }
        if (startTime != null) {
            builder.append("startTime: ");
            builder.append(startTime);
            builder.append(" | ");
        }
        if (endTime != null) {
            builder.append("endTime: ");
            builder.append(endTime);
            builder.append(" | ");
        }
        if (amountOfHours != null) {
            builder.append("amountOfHours: ");
            builder.append(amountOfHours);
            builder.append(" | ");
        }
        if (totalPrice != null) {
            builder.append("totalPrice: ");
            builder.append(totalPrice);
            builder.append(" | ");
        }
        if (funcionario != null) {
            builder.append("funcionario: ");
            builder.append(funcionario);
            builder.append(" | ");
        }
        if (status != null) {
            builder.append("status: ");
            builder.append(status);
        }
        builder.append("]");
        return builder.toString();
    }

}
