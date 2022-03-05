package com.dogancankilic.kotlinbase.presentation.productdetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProductDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProductDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ProductDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProductDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProductDetailFragmentArgs __result = new ProductDetailFragmentArgs();
    bundle.setClassLoader(ProductDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("@string/productId")) {
      String StringProductId;
      StringProductId = bundle.getString("@string/productId");
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("@string/productId", StringProductId);
    } else {
      throw new IllegalArgumentException("Required argument \"@string/productId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProductDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ProductDetailFragmentArgs __result = new ProductDetailFragmentArgs();
    if (savedStateHandle.contains("@string/productId")) {
      String StringProductId;
      StringProductId = savedStateHandle.get("@string/productId");
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("@string/productId", StringProductId);
    } else {
      throw new IllegalArgumentException("Required argument \"@string/productId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getStringProductId() {
    return (String) arguments.get("@string/productId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("@string/productId")) {
      String StringProductId = (String) arguments.get("@string/productId");
      __result.putString("@string/productId", StringProductId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ProductDetailFragmentArgs that = (ProductDetailFragmentArgs) object;
    if (arguments.containsKey("@string/productId") != that.arguments.containsKey("@string/productId")) {
      return false;
    }
    if (getStringProductId() != null ? !getStringProductId().equals(that.getStringProductId()) : that.getStringProductId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getStringProductId() != null ? getStringProductId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ProductDetailFragmentArgs{"
        + "StringProductId=" + getStringProductId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(ProductDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String StringProductId) {
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("@string/productId", StringProductId);
    }

    @NonNull
    public ProductDetailFragmentArgs build() {
      ProductDetailFragmentArgs result = new ProductDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setStringProductId(@NonNull String StringProductId) {
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("@string/productId", StringProductId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStringProductId() {
      return (String) arguments.get("@string/productId");
    }
  }
}
