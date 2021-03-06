// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.ui.booktitle;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookTitleActivity_MembersInjector implements MembersInjector<BookTitleActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public BookTitleActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<BookTitleActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new BookTitleActivity_MembersInjector(androidInjectorProvider, factoryProvider);}

  @Override
  public void injectMembers(BookTitleActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.example.bookstory.ui.booktitle.BookTitleActivity.factory")
  public static void injectFactory(BookTitleActivity instance, ViewModelProvider.Factory factory) {
    instance.factory = factory;
  }
}
