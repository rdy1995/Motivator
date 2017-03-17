// Generated code from Butter Knife. Do not modify!
package com.firebase.uidemo.auth;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.firebase.uidemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AuthUiActivity_ViewBinding implements Unbinder {
  private AuthUiActivity target;

  private View view2131820712;

  @UiThread
  public AuthUiActivity_ViewBinding(AuthUiActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AuthUiActivity_ViewBinding(final AuthUiActivity target, View source) {
    this.target = target;

    View view;
    target.mUseEmailProvider = Utils.findRequiredViewAsType(source, R.id.email_provider, "field 'mUseEmailProvider'", CheckBox.class);
    target.mUseGoogleProvider = Utils.findRequiredViewAsType(source, R.id.google_provider, "field 'mUseGoogleProvider'", CheckBox.class);
    target.mUseFacebookProvider = Utils.findRequiredViewAsType(source, R.id.facebook_provider, "field 'mUseFacebookProvider'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.sign_in, "field 'mSignIn' and method 'signIn'");
    target.mSignIn = Utils.castView(view, R.id.sign_in, "field 'mSignIn'", Button.class);
    view2131820712 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.signIn(p0);
      }
    });
    target.mRootView = Utils.findRequiredView(source, R.id.root, "field 'mRootView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    AuthUiActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mUseEmailProvider = null;
    target.mUseGoogleProvider = null;
    target.mUseFacebookProvider = null;
    target.mSignIn = null;
    target.mRootView = null;

    view2131820712.setOnClickListener(null);
    view2131820712 = null;
  }
}
