// Generated by data binding compiler. Do not edit!
package com.example.bookstory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.bookstory.R;
import com.example.bookstory.ui.booktitle.BookTitleViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityBookTitleBinding extends ViewDataBinding {
  @NonNull
  public final Button btReadBook;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final LinearLayout linearDev;

  @NonNull
  public final Toolbar toolbarTitle;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvBookType;

  @NonNull
  public final TextView tvChapters;

  @NonNull
  public final TextView tvDateCreate;

  @NonNull
  public final TextView tvDateUpdate;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvState;

  @NonNull
  public final TextView tvTranslator;

  @Bindable
  protected BookTitleViewModel mViewholder;

  protected ActivityBookTitleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btReadBook, ConstraintLayout constraintLayout, LinearLayout linearDev,
      Toolbar toolbarTitle, TextView tvAuthor, TextView tvBookType, TextView tvChapters,
      TextView tvDateCreate, TextView tvDateUpdate, TextView tvDescription, TextView tvName,
      TextView tvState, TextView tvTranslator) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btReadBook = btReadBook;
    this.constraintLayout = constraintLayout;
    this.linearDev = linearDev;
    this.toolbarTitle = toolbarTitle;
    this.tvAuthor = tvAuthor;
    this.tvBookType = tvBookType;
    this.tvChapters = tvChapters;
    this.tvDateCreate = tvDateCreate;
    this.tvDateUpdate = tvDateUpdate;
    this.tvDescription = tvDescription;
    this.tvName = tvName;
    this.tvState = tvState;
    this.tvTranslator = tvTranslator;
  }

  public abstract void setViewholder(@Nullable BookTitleViewModel viewholder);

  @Nullable
  public BookTitleViewModel getViewholder() {
    return mViewholder;
  }

  @NonNull
  public static ActivityBookTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_book_title, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityBookTitleBinding>inflateInternal(inflater, R.layout.activity_book_title, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityBookTitleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_book_title, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityBookTitleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityBookTitleBinding>inflateInternal(inflater, R.layout.activity_book_title, null, false, component);
  }

  public static ActivityBookTitleBinding bind(@NonNull View view) {
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
  public static ActivityBookTitleBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityBookTitleBinding)bind(component, view, R.layout.activity_book_title);
  }
}
