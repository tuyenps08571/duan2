// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.data.response;

import com.example.bookstory.dao.HistoryDAO;
import com.example.bookstory.service.HistoryApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HistoryRepository_Factory implements Factory<HistoryRepository> {
  private final Provider<HistoryApi> historyApiProvider;

  private final Provider<HistoryDAO> historyDAOProvider;

  public HistoryRepository_Factory(Provider<HistoryApi> historyApiProvider,
      Provider<HistoryDAO> historyDAOProvider) {
    this.historyApiProvider = historyApiProvider;
    this.historyDAOProvider = historyDAOProvider;
  }

  @Override
  public HistoryRepository get() {
    return newInstance(historyApiProvider.get(), historyDAOProvider.get());
  }

  public static HistoryRepository_Factory create(Provider<HistoryApi> historyApiProvider,
      Provider<HistoryDAO> historyDAOProvider) {
    return new HistoryRepository_Factory(historyApiProvider, historyDAOProvider);
  }

  public static HistoryRepository newInstance(HistoryApi historyApi, HistoryDAO historyDAO) {
    return new HistoryRepository(historyApi, historyDAO);
  }
}
