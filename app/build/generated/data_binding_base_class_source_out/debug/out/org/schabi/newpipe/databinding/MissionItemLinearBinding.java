// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;

public final class MissionItemLinearBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout itemBkg;

  @NonNull
  public final ImageView itemIcon;

  @NonNull
  public final ImageView itemMore;

  @NonNull
  public final TextView itemName;

  @NonNull
  public final TextView itemSize;

  @NonNull
  public final TextView itemStatus;

  private MissionItemLinearBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout itemBkg, @NonNull ImageView itemIcon, @NonNull ImageView itemMore,
      @NonNull TextView itemName, @NonNull TextView itemSize, @NonNull TextView itemStatus) {
    this.rootView = rootView;
    this.itemBkg = itemBkg;
    this.itemIcon = itemIcon;
    this.itemMore = itemMore;
    this.itemName = itemName;
    this.itemSize = itemSize;
    this.itemStatus = itemStatus;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MissionItemLinearBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MissionItemLinearBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.mission_item_linear, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MissionItemLinearBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_bkg;
      RelativeLayout itemBkg = ViewBindings.findChildViewById(rootView, id);
      if (itemBkg == null) {
        break missingId;
      }

      id = R.id.item_icon;
      ImageView itemIcon = ViewBindings.findChildViewById(rootView, id);
      if (itemIcon == null) {
        break missingId;
      }

      id = R.id.item_more;
      ImageView itemMore = ViewBindings.findChildViewById(rootView, id);
      if (itemMore == null) {
        break missingId;
      }

      id = R.id.item_name;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.item_size;
      TextView itemSize = ViewBindings.findChildViewById(rootView, id);
      if (itemSize == null) {
        break missingId;
      }

      id = R.id.item_status;
      TextView itemStatus = ViewBindings.findChildViewById(rootView, id);
      if (itemStatus == null) {
        break missingId;
      }

      return new MissionItemLinearBinding((RelativeLayout) rootView, itemBkg, itemIcon, itemMore,
          itemName, itemSize, itemStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
