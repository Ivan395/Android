// Generated code from Butter Knife. Do not modify!
package com.github.ivan395.calculadora;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230754;

  private View view2131230763;

  private View view2131230764;

  private View view2131230758;

  private View view2131230761;

  private View view2131230756;

  private View view2131230757;

  private View view2131230769;

  private View view2131230760;

  private View view2131230765;

  private View view2131230768;

  private View view2131230762;

  private View view2131230770;

  private View view2131230755;

  private View view2131230759;

  private View view2131230766;

  private View view2131230767;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.etInput = Utils.findRequiredViewAsType(source, R.id.etInput, "field 'etInput'", EditText.class);
    target.contentMain = Utils.findRequiredViewAsType(source, R.id.contentMain, "field 'contentMain'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.btnClear, "field 'btnClear' and method 'onClickControls'");
    target.btnClear = Utils.castView(view, R.id.btnClear, "field 'btnClear'", Button.class);
    view2131230754 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnResult, "field 'btnResult' and method 'onClickControls'");
    target.btnResult = Utils.castView(view, R.id.btnResult, "field 'btnResult'", Button.class);
    view2131230763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSeven, "method 'onClickNumbers'");
    view2131230764 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnFour, "method 'onClickNumbers'");
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnOne, "method 'onClickNumbers'");
    view2131230761 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnEight, "method 'onClickNumbers'");
    view2131230756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnFive, "method 'onClickNumbers'");
    view2131230757 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnTwo, "method 'onClickNumbers'");
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnNine, "method 'onClickNumbers'");
    view2131230760 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSix, "method 'onClickNumbers'");
    view2131230765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnThree, "method 'onClickNumbers'");
    view2131230768 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnPoint, "method 'onClickNumbers'");
    view2131230762 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnZero, "method 'onClickNumbers'");
    view2131230770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNumbers(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnDiv, "method 'onClickControls'");
    view2131230755 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnMulti, "method 'onClickControls'");
    view2131230759 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSub, "method 'onClickControls'");
    view2131230766 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSum, "method 'onClickControls'");
    view2131230767 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickControls(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etInput = null;
    target.contentMain = null;
    target.btnClear = null;
    target.btnResult = null;

    view2131230754.setOnClickListener(null);
    view2131230754 = null;
    view2131230763.setOnClickListener(null);
    view2131230763 = null;
    view2131230764.setOnClickListener(null);
    view2131230764 = null;
    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230761.setOnClickListener(null);
    view2131230761 = null;
    view2131230756.setOnClickListener(null);
    view2131230756 = null;
    view2131230757.setOnClickListener(null);
    view2131230757 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
    view2131230760.setOnClickListener(null);
    view2131230760 = null;
    view2131230765.setOnClickListener(null);
    view2131230765 = null;
    view2131230768.setOnClickListener(null);
    view2131230768 = null;
    view2131230762.setOnClickListener(null);
    view2131230762 = null;
    view2131230770.setOnClickListener(null);
    view2131230770 = null;
    view2131230755.setOnClickListener(null);
    view2131230755 = null;
    view2131230759.setOnClickListener(null);
    view2131230759 = null;
    view2131230766.setOnClickListener(null);
    view2131230766 = null;
    view2131230767.setOnClickListener(null);
    view2131230767 = null;
  }
}
