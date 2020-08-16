// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.di.module;

import com.example.bookstory.service.UserApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteModule_ProviderUserApiFactory implements Factory<UserApi> {
  private final RemoteModule module;

  private final Provider<Retrofit> retrofitProvider;

  public RemoteModule_ProviderUserApiFactory(RemoteModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserApi get() {
    return providerUserApi(module, retrofitProvider.get());
  }

  public static RemoteModule_ProviderUserApiFactory create(RemoteModule module,
      Provider<Retrofit> retrofitProvider) {
    return new RemoteModule_ProviderUserApiFactory(module, retrofitProvider);
  }

  public static UserApi providerUserApi(RemoteModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.providerUserApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}