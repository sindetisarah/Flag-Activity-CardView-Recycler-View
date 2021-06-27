package com.example.mycontacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter(var contactList: List<Contacts>,var context: Context) :RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        //set att to the view displayed.Bind the data to the views
        holder.tvName.text=currentContact.name
        holder.tvPhoneNumber.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        //load function takes in a url so on load provide the image url
        Picasso.get()
            .load(currentContact.imageUrl)
                //adding the default picture
            .placeholder(R.drawable.defaulted)
            .into(holder.imgContacts)

        holder.cvContacts.setOnClickListener {
            var intent = Intent(context,ViewContactActivity::class.java)
            intent.putExtra("image",currentContact.imageUrl)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size

    }

}
class ContactsViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    //casting the id of the root elements
    var imgContacts=itemView.findViewById<ImageView>(R.id.imgContacts)
    var cvContacts = itemView.findViewById<CardView>(R.id.cvContacts)
}