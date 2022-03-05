package com.dogancankilic.kotlinbase;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dogancankilic.kotlinbase.databinding.ActivityMainBindingImpl;
import com.dogancankilic.kotlinbase.databinding.ProductDetailFragmentBindingImpl;
import com.dogancankilic.kotlinbase.databinding.ProductListFragmentBindingImpl;
import com.dogancankilic.kotlinbase.databinding.ProductListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_PRODUCTDETAILFRAGMENT = 2;

  private static final int LAYOUT_PRODUCTLISTFRAGMENT = 3;

  private static final int LAYOUT_PRODUCTLISTITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dogancankilic.kotlinbase.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dogancankilic.kotlinbase.R.layout.product_detail_fragment, LAYOUT_PRODUCTDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dogancankilic.kotlinbase.R.layout.product_list_fragment, LAYOUT_PRODUCTLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dogancankilic.kotlinbase.R.layout.product_list_item, LAYOUT_PRODUCTLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTDETAILFRAGMENT: {
          if ("layout/product_detail_fragment_0".equals(tag)) {
            return new ProductDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for product_detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTLISTFRAGMENT: {
          if ("layout/product_list_fragment_0".equals(tag)) {
            return new ProductListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for product_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTLISTITEM: {
          if ("layout/product_list_item_0".equals(tag)) {
            return new ProductListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for product_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.dogancankilic.kotlinbase.R.layout.activity_main);
      sKeys.put("layout/product_detail_fragment_0", com.dogancankilic.kotlinbase.R.layout.product_detail_fragment);
      sKeys.put("layout/product_list_fragment_0", com.dogancankilic.kotlinbase.R.layout.product_list_fragment);
      sKeys.put("layout/product_list_item_0", com.dogancankilic.kotlinbase.R.layout.product_list_item);
    }
  }
}
