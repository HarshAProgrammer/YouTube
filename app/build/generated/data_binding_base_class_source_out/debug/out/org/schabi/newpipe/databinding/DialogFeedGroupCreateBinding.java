// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;

public final class DialogFeedGroupCreateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button confirmButton;

  @NonNull
  public final ImageButton deleteButton;

  @NonNull
  public final TextView deleteScreenMessage;

  @NonNull
  public final EditText groupNameInput;

  @NonNull
  public final TextInputLayout groupNameInputContainer;

  @NonNull
  public final ImageButton iconPreview;

  @NonNull
  public final RecyclerView iconSelector;

  @NonNull
  public final ConstraintLayout optionsRoot;

  @NonNull
  public final Button selectChannelButton;

  @NonNull
  public final TextView selectedSubscriptionCountView;

  @NonNull
  public final View separator;

  @NonNull
  public final TextView subscriptionsHeaderInfo;

  @NonNull
  public final LinearLayout subscriptionsHeaderInfoContainer;

  @NonNull
  public final ToolbarSearchLayoutBinding subscriptionsHeaderSearchContainer;

  @NonNull
  public final Toolbar subscriptionsHeaderToolbar;

  @NonNull
  public final LinearLayout subscriptionsSelector;

  @NonNull
  public final RecyclerView subscriptionsSelectorList;

  private DialogFeedGroupCreateBinding(@NonNull LinearLayout rootView, @NonNull Button cancelButton,
      @NonNull Button confirmButton, @NonNull ImageButton deleteButton,
      @NonNull TextView deleteScreenMessage, @NonNull EditText groupNameInput,
      @NonNull TextInputLayout groupNameInputContainer, @NonNull ImageButton iconPreview,
      @NonNull RecyclerView iconSelector, @NonNull ConstraintLayout optionsRoot,
      @NonNull Button selectChannelButton, @NonNull TextView selectedSubscriptionCountView,
      @NonNull View separator, @NonNull TextView subscriptionsHeaderInfo,
      @NonNull LinearLayout subscriptionsHeaderInfoContainer,
      @NonNull ToolbarSearchLayoutBinding subscriptionsHeaderSearchContainer,
      @NonNull Toolbar subscriptionsHeaderToolbar, @NonNull LinearLayout subscriptionsSelector,
      @NonNull RecyclerView subscriptionsSelectorList) {
    this.rootView = rootView;
    this.cancelButton = cancelButton;
    this.confirmButton = confirmButton;
    this.deleteButton = deleteButton;
    this.deleteScreenMessage = deleteScreenMessage;
    this.groupNameInput = groupNameInput;
    this.groupNameInputContainer = groupNameInputContainer;
    this.iconPreview = iconPreview;
    this.iconSelector = iconSelector;
    this.optionsRoot = optionsRoot;
    this.selectChannelButton = selectChannelButton;
    this.selectedSubscriptionCountView = selectedSubscriptionCountView;
    this.separator = separator;
    this.subscriptionsHeaderInfo = subscriptionsHeaderInfo;
    this.subscriptionsHeaderInfoContainer = subscriptionsHeaderInfoContainer;
    this.subscriptionsHeaderSearchContainer = subscriptionsHeaderSearchContainer;
    this.subscriptionsHeaderToolbar = subscriptionsHeaderToolbar;
    this.subscriptionsSelector = subscriptionsSelector;
    this.subscriptionsSelectorList = subscriptionsSelectorList;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFeedGroupCreateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFeedGroupCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_feed_group_create, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFeedGroupCreateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_button;
      Button cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.confirm_button;
      Button confirmButton = ViewBindings.findChildViewById(rootView, id);
      if (confirmButton == null) {
        break missingId;
      }

      id = R.id.delete_button;
      ImageButton deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.delete_screen_message;
      TextView deleteScreenMessage = ViewBindings.findChildViewById(rootView, id);
      if (deleteScreenMessage == null) {
        break missingId;
      }

      id = R.id.group_name_input;
      EditText groupNameInput = ViewBindings.findChildViewById(rootView, id);
      if (groupNameInput == null) {
        break missingId;
      }

      id = R.id.group_name_input_container;
      TextInputLayout groupNameInputContainer = ViewBindings.findChildViewById(rootView, id);
      if (groupNameInputContainer == null) {
        break missingId;
      }

      id = R.id.icon_preview;
      ImageButton iconPreview = ViewBindings.findChildViewById(rootView, id);
      if (iconPreview == null) {
        break missingId;
      }

      id = R.id.icon_selector;
      RecyclerView iconSelector = ViewBindings.findChildViewById(rootView, id);
      if (iconSelector == null) {
        break missingId;
      }

      id = R.id.options_root;
      ConstraintLayout optionsRoot = ViewBindings.findChildViewById(rootView, id);
      if (optionsRoot == null) {
        break missingId;
      }

      id = R.id.select_channel_button;
      Button selectChannelButton = ViewBindings.findChildViewById(rootView, id);
      if (selectChannelButton == null) {
        break missingId;
      }

      id = R.id.selected_subscription_count_view;
      TextView selectedSubscriptionCountView = ViewBindings.findChildViewById(rootView, id);
      if (selectedSubscriptionCountView == null) {
        break missingId;
      }

      id = R.id.separator;
      View separator = ViewBindings.findChildViewById(rootView, id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.subscriptions_header_info;
      TextView subscriptionsHeaderInfo = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsHeaderInfo == null) {
        break missingId;
      }

      id = R.id.subscriptions_header_info_container;
      LinearLayout subscriptionsHeaderInfoContainer = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsHeaderInfoContainer == null) {
        break missingId;
      }

      id = R.id.subscriptions_header_search_container;
      View subscriptionsHeaderSearchContainer = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsHeaderSearchContainer == null) {
        break missingId;
      }
      ToolbarSearchLayoutBinding binding_subscriptionsHeaderSearchContainer = ToolbarSearchLayoutBinding.bind(subscriptionsHeaderSearchContainer);

      id = R.id.subscriptions_header_toolbar;
      Toolbar subscriptionsHeaderToolbar = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsHeaderToolbar == null) {
        break missingId;
      }

      id = R.id.subscriptions_selector;
      LinearLayout subscriptionsSelector = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsSelector == null) {
        break missingId;
      }

      id = R.id.subscriptions_selector_list;
      RecyclerView subscriptionsSelectorList = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionsSelectorList == null) {
        break missingId;
      }

      return new DialogFeedGroupCreateBinding((LinearLayout) rootView, cancelButton, confirmButton,
          deleteButton, deleteScreenMessage, groupNameInput, groupNameInputContainer, iconPreview,
          iconSelector, optionsRoot, selectChannelButton, selectedSubscriptionCountView, separator,
          subscriptionsHeaderInfo, subscriptionsHeaderInfoContainer,
          binding_subscriptionsHeaderSearchContainer, subscriptionsHeaderToolbar,
          subscriptionsSelector, subscriptionsSelectorList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
