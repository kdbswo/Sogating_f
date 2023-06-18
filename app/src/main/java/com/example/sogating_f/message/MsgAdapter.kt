package com.example.sogating_f.message

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.sogating_f.R

class MsgAdapter(val context: Context, val items: MutableList<MsgModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1
        if (convertView == null) {
            convertView =
                LayoutInflater.from(p2?.context).inflate(R.layout.list_view_item, p2, false)
        }

        val nicknameArea = convertView!!.findViewById<TextView>(R.id.listViewItemNicknameArea)
        val textArea = convertView!!.findViewById<TextView>(R.id.listViewItemNickname)
        nicknameArea.text = items[p0].senderInfo
        textArea.text = items[p0].sendTxt

        return convertView!!
    }

}