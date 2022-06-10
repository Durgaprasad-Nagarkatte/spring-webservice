package com.durgaprasad.spring.webservices.springwebservice.user;

import java.util.Date;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
  @NonNull
  private Integer userId;
  @NonNull
  private String name;
  @NonNull
  private Date dateOfBirth;
}
