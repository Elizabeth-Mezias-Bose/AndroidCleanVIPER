package com.twere.android.clean.viper.presentation.main.modules.common;

import android.support.annotation.StringRes;

public interface BaseMainView {
  void showError(@StringRes int message);

  void showNewMessagesNotification();
}
