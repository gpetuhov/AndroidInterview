package com.gpetuhov.androidinterviewcodesamples

import android.content.Context
import android.content.Intent
import android.net.Uri

// =====================================================
// Is there any potential problem in this code?
fun openWebsite(context: Context?, websiteUrl: String?) {
    val uri = Uri.parse(websiteUrl)
    val intent = Intent(Intent.ACTION_VIEW, uri)
    context?.startActivity(intent)
}

// Answer
fun openWebsite2(context: Context?, websiteUrl: String?) {
    websiteUrl?.let {
        val uri = Uri.parse(websiteUrl)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        val packageManager = context?.packageManager

        if (packageManager != null && intent.resolveActivity(packageManager) != null) {
            context.startActivity(intent)
        }
    }
}

// =====================================================
