// Generated by Dagger (https://google.github.io/dagger).
package com.tolga.app.slidermvvmkotlin.ui.main.homepage;

import com.tolga.app.slidermvvmkotlin.db.AppDatabase;
import com.tolga.app.slidermvvmkotlin.service.NbrbAPI;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class HomePageViewModel_MembersInjector implements MembersInjector<HomePageViewModel> {
  private final Provider<AppDatabase> dbProvider;

  private final Provider<NbrbAPI> apiProvider;

  public HomePageViewModel_MembersInjector(
      Provider<AppDatabase> dbProvider, Provider<NbrbAPI> apiProvider) {
    this.dbProvider = dbProvider;
    this.apiProvider = apiProvider;
  }

  public static MembersInjector<HomePageViewModel> create(
      Provider<AppDatabase> dbProvider, Provider<NbrbAPI> apiProvider) {
    return new HomePageViewModel_MembersInjector(dbProvider, apiProvider);
  }

  @Override
  public void injectMembers(HomePageViewModel instance) {
    injectDb(instance, dbProvider.get());
    injectApi(instance, apiProvider.get());
  }

  public static void injectDb(HomePageViewModel instance, AppDatabase db) {
    instance.db = db;
  }

  public static void injectApi(HomePageViewModel instance, NbrbAPI api) {
    instance.api = api;
  }
}