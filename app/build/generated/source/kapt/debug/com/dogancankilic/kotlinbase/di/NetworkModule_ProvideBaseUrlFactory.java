// Generated by Dagger (https://dagger.dev).
package com.dogancankilic.kotlinbase.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideBaseUrlFactory implements Factory<String> {
  @Override
  public String get() {
    return provideBaseUrl();
  }

  public static NetworkModule_ProvideBaseUrlFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideBaseUrl() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideBaseUrl());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideBaseUrlFactory INSTANCE = new NetworkModule_ProvideBaseUrlFactory();
  }
}
