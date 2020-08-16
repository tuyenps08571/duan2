// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.data.response;

import com.example.bookstory.service.UserApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserApi> userApiProvider;

  public UserRepository_Factory(Provider<UserApi> userApiProvider) {
    this.userApiProvider = userApiProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userApiProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserApi> userApiProvider) {
    return new UserRepository_Factory(userApiProvider);
  }

  public static UserRepository newInstance(UserApi userApi) {
    return new UserRepository(userApi);
  }
}