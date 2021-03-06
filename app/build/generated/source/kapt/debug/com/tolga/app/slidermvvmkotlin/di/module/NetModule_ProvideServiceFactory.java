// Generated by Dagger (https://google.github.io/dagger).
package com.tolga.app.slidermvvmkotlin.di.module;

import com.tolga.app.slidermvvmkotlin.service.NbrbAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class NetModule_ProvideServiceFactory implements Factory<NbrbAPI> {
  private final NetModule module;

  private final Provider<Retrofit.Builder> retrofitProvider;

  public NetModule_ProvideServiceFactory(
      NetModule module, Provider<Retrofit.Builder> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NbrbAPI get() {
    return Preconditions.checkNotNull(
        module.provideService(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvideServiceFactory create(
      NetModule module, Provider<Retrofit.Builder> retrofitProvider) {
    return new NetModule_ProvideServiceFactory(module, retrofitProvider);
  }

  public static NbrbAPI proxyProvideService(NetModule instance, Retrofit.Builder retrofit) {
    return Preconditions.checkNotNull(
        instance.provideService(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
