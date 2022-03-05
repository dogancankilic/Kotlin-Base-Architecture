// Generated by Dagger (https://dagger.dev).
package com.dogancankilic.kotlinbase.domain.products;

import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductsUseCase_Factory implements Factory<ProductsUseCase> {
  private final Provider<ProductsDataSourceImpl> remoteDataSourceProvider;

  public ProductsUseCase_Factory(Provider<ProductsDataSourceImpl> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public ProductsUseCase get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static ProductsUseCase_Factory create(
      Provider<ProductsDataSourceImpl> remoteDataSourceProvider) {
    return new ProductsUseCase_Factory(remoteDataSourceProvider);
  }

  public static ProductsUseCase newInstance(ProductsDataSourceImpl remoteDataSource) {
    return new ProductsUseCase(remoteDataSource);
  }
}
