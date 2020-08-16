// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.ui.main.fragment.category.category;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookTypeFragment_MembersInjector implements MembersInjector<BookTypeFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public BookTypeFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<BookTypeFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new BookTypeFragment_MembersInjector(androidInjectorProvider, factoryProvider);}

  @Override
  public void injectMembers(BookTypeFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.example.bookstory.ui.main.fragment.category.category.BookTypeFragment.factory")
  public static void injectFactory(BookTypeFragment instance, ViewModelProvider.Factory factory) {
    instance.factory = factory;
  }
}