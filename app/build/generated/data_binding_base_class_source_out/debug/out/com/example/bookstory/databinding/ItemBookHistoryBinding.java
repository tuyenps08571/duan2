// Generated by data binding compiler. Do not edit!
package com.example.bookstory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.bookstory.R;
import com.example.bookstory.vo.History;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBookHistoryBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvChapters;

  @NonNull
  public final TextView tvName;

  @Bindable
  protected History mHistory;

  protected ItemBookHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvChapters, TextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvChapters = tvChapters;
    this.tvName = tvName;
  }

  public abstract void setHistory(@Nullable History history);

  @Nullable
  public History getHistory() {
    return mHistory;
  }

  @NonNull
  public static ItemBookHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_book_history, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBookHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBookHistoryBinding>inflateInternal(inflater, R.layout.item_book_history, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBookHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_book_history, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBookHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemBookHistoryBinding>inflateInternal(inflater, R.layout.item_book_history, null, false, component);
  }

  public static ItemBookHistoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemBookHistoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBookHistoryBinding)bind(component, view, R.layout.item_book_history);
  }
}
