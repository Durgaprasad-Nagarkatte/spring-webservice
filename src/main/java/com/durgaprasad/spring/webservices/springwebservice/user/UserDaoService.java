package com.durgaprasad.spring.webservices.springwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
  private static final List<User> users = new ArrayList<>();
  private static int userCount = 3;
  
  static {
    users.add(new User(1, "Adam", new Date()));
    users.add(new User(2, "Eve", new Date()));
    users.add(new User(3, "Jack", new Date()));
  }

  public List<User> findAll() {
    return users;
  }

  public User save(User user) {
    if(user == null) {
      return null;
    }
    user.setUserId(++userCount);
    users.add(user);
    return user;
  }

  public User findOne(int id) {
    for (User user : users) {
      if (user.getUserId().equals(id)) {
        return user;
      }
    }
    return null;
  }

}
