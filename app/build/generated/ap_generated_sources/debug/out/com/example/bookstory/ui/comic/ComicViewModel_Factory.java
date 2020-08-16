// Generated by Dagger (https://dagger.dev).
package com.example.bookstory.ui.comic;

import com.example.bookstory.data.response.ComicChapterRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ComicViewModel_Factory implements Factory<ComicViewModel> {
  private final Provider<ComicChapterRepository> comicChapterRepositoryProvider;

  public ComicViewModel_Factory(Provider<ComicChapterRepository> comicChapterRepositoryProvider) {
    this.comicChapterRepositoryProvider = comicChapterRepositoryProvider;
  }

  @Override
  public ComicViewModel get() {
    return newInstance(comicChapterRepositoryProvider.get());
  }

  public static ComicViewModel_Factory create(
      Provider<ComicChapterRepository> comicChapterRepositoryProvider) {
    return new ComicViewModel_Factory(comicChapterRepositoryProvider);
  }

  public static ComicViewModel newInstance(ComicChapterRepository comicChapterRepository) {
    return new ComicViewModel(comicChapterRepository);
  }
}