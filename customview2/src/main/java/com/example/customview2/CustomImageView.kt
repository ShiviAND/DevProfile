package com.example.customview2

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.layout_custom_imageview.view.*

class CustomImageView(context: Context,attrs:AttributeSet?) : ConstraintLayout(context, attrs){

    private val TAG=CustomImageView::class.java.simpleName


    init{
        inflate(context,R.layout.layout_custom_imageview,this)

        attrs?.let{attributeSet ->
            val attributes=context.obtainStyledAttributes(attributeSet,R.styleable.CustomImageView)
            try{
                imageView.setImageDrawable(attributes.getDrawable(R.styleable.CustomImageView_imageRef))
                textView.text=attributes.getString(R.styleable.CustomImageView_text)
                var style=attributes.getInt(R.styleable.CustomImageView_descriptionTextStyle,2)
                Log.d("Coco", "style= $style")
                when(style){
                    0-> textView.setTypeface(Typeface.DEFAULT)
                    1-> textView.setTypeface(Typeface.DEFAULT_BOLD)
                    2-> textView.setTypeface(null,Typeface.ITALIC)
                }
            }
            finally {
                attributes.recycle()
            }
        }
    }




}