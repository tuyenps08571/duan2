// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.data.response;

import com.example.bookstory.dao.BookTypeDAO;
import com.example.bookstory.service.BookTypeApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookTypeRepository_Factory implements Factory<BookTypeRepository> {
  private final Provider<BookTypeApi> bookTypeApiProvider;

  private final Provider<BookTypeDAO> bookTypeDAOProvider;

  public BookTypeRepository_Factory(Provider<BookTypeApi> bookTypeApiProvider,
      Provider<BookTypeDAO> bookTypeDAOProvider) {
    this.bookTypeApiProvider = bookTypeApiProvider;
    this.bookTypeDAOProvider = bookTypeDAOProvider;
  }

  @Override
  public BookTypeRepository get() {
    return newInstance(bookTypeApiProvider.get(), bookTypeDAOProvider.get());
  }

  public static BookTypeRepository_Factory create(Provider<BookTypeApi> bookTypeApiProvider,
      Provider<BookTypeDAO> bookTypeDAOProvider) {
    return new BookTypeRepository_Factory(bookTypeApiProvider, bookTypeDAOProvider);
  }

  public static BookTypeRepository newInstance(BookTypeApi bookTypeApi, BookTypeDAO bookTypeDAO) {
    return new BookTypeRepository(bookTypeApi, bookTypeDAO);
  }
}
