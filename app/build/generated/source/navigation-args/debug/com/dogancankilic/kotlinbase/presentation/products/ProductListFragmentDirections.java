package com.dogancankilic.kotlinbase.presentation.products;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.dogancankilic.kotlinbase.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProductListFragmentDirections {
  private ProductListFragmentDirections() {
  }

  @NonNull
  public static NavigateToProductDetail navigateToProductDetail(@NonNull String StringProductId) {
    return new NavigateToProductDetail(StringProductId);
  }

  public static class NavigateToProductDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private NavigateToProductDetail(@NonNull String StringProductId) {
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("@string/productId", StringProductId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public NavigateToProductDetail setStringProductId(@NonNull String StringProductId) {
      if (StringProductId == null) {
        throw new IllegalArgumentException("Argument \"@string/productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("@string/productId", StringProductId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("@string/productId")) {
        String StringProductId = (String) arguments.get("@string/productId");
        __result.putString("@string/productId", StringProductId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.navigateToProductDetail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStringProductId() {
      return (String) arguments.get("@string/productId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      NavigateToProductDetail that = (NavigateToProductDetail) object;
      if (arguments.containsKey("@string/productId") != that.arguments.containsKey("@string/productId")) {
        return false;
      }
      if (getStringProductId() != null ? !getStringProductId().equals(that.getStringProductId()) : that.getStringProductId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getStringProductId() != null ? getStringProductId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "NavigateToProductDetail(actionId=" + getActionId() + "){"
          + "StringProductId=" + getStringProductId()
          + "}";
    }
  }
}
