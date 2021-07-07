package com.jpaPractice.demo.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
public class UserId implements Serializable {
    private UUID id;

    private String employeeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return id.equals(userId.id) && employeeId.equals(userId.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId);
    }
}
