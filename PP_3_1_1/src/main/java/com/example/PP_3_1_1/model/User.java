package com.example.PP_3_1_1.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Component
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Поле \"Name\" не может быть пустым")
    @Size(min=2, message = "\"Name\" должно состоять не менее, чем из двух букв")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "Поле \"Last Name\" не может быть пустым")
    @Size(min=2, message = "\"Last Name\" должно состоять не менее, чем из двух букв")
    private String lastName;

    @Column(name = "age")
    @Min(value = 1, message = "Возраст должен быть больше 0")
    private byte age;

    @Column(name = "email")
    @NotEmpty(message = "Поле \"E-mail\" обязательно для заполнения")
    @Size(min=8, message = "Поле \"E-mail\" должно состоять не менее, чем из 8 знаков")
    private String email;
}
