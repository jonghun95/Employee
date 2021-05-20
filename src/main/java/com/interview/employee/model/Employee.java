package com.interview.employee.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Employee
{
    private int id;
    @Size(max=100, message = "Name size is over max limit")
    private String name;
    @Size(max=4)
    @Pattern(regexp= "[1-5][0-9][0-9][A-F]", message = "Invalid office")
    private String office;
    @Size(max=150, message = "Email size is over max limit")
    @Email(message = "Invalid email")
    private String email;
    @Size(max=12, message = "Phone number size is over max limit")
    @Pattern(regexp= "\\d{3}-\\d{3}-\\d{4}", message = "Invalid Phone format")
    private String phone;
    @Size(max=150, message = "Role size is over max limit")
    private String role;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name)
            && Objects.equals(office, employee.office)
            && Objects.equals(email, employee.email)
            && Objects.equals(phone, employee.phone) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, office, email, phone, role);
    }

    @Override
    public String toString()
    {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", office='"
            + office + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\''
            + ", role='" + role +
            '\'' + '}';
    }
}
