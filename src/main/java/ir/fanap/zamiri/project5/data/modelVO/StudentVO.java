package ir.fanap.zamiri.project5.data.modelVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentVO {

    private long id;
    private Date created;
    private Date updated;

    //@JsonProperty("first-name")
    private String firstName;

    //@JsonProperty("last-name")
    private String lastName;
    private String code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
