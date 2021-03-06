package com.ammy.recylerview;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by amandeepsingh on 8/8/16.
 */
public class MyItemDecor extends RecyclerView.ItemDecoration {

    private Drawable mDivider;

    public MyItemDecor(Drawable mDivider) {
        this.mDivider = mDivider;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

//        if (parent.getChildAdapterPosition(view) == 0) {
//            return;
//        }
        outRect.right=5;
        outRect.top = 10;
        outRect.left= 5;
    }


//    @Override
//    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
//        int dividerLeft = parent.getPaddingLeft();
//        int dividerRight = parent.getWidth() - parent.getPaddingRight();
//
//        int childCount = parent.getChildCount();
//        for (int i = 0; i < childCount - 1; i++) {
//            View child = parent.getChildAt(i);
//
//            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
//
//            int dividerTop = child.getBottom() + params.bottomMargin;
//            int dividerBottom = dividerTop + mDivider.getIntrinsicHeight();
//
//            mDivider.setBounds(dividerLeft, dividerTop, dividerRight, dividerBottom);
//            mDivider.draw(canvas);
//        }
//    }

}
