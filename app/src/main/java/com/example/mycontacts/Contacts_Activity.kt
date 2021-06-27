package com.example.mycontacts

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Contacts_Activity : AppCompatActivity() {
    lateinit var contactList:List<Contacts>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        getContacts()
        //editText which takes in a Watcher to trigger the change
//        var editText=findViewById<EditText>(R.id.editText)
//        editText.addTextChangedListener(textWatcher)

    }
    fun getContacts()
    {
        var rvContacts=findViewById<RecyclerView>(R.id.rvContacts)
        //adapater expect a list of courses which we will need to create
         contactList= listOf(
            Contacts("Shadya Obuya","0723456790","shadi@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKKeHMlsoQf1NnO-7-TRj3wohYucvSIvNM8dQlTGLowTjkX3QkCUXkYJVQxmovz4PAxnc&usqp=CAU"),
            Contacts("Juliet Gisemba","0768790998","julie@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiViKLdF4xn4BOMnHZrMYhBbtEcrbBizgNTzDr_rCXJEcj0rk-4qX8OYIs8Z9-JPk0b98&usqp=CAU"),
            Contacts("Constant Kavaya","011178980","coni@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc9R8kIF6zyxyskxEDGtkaX5eO-rbr0MDyuEsXh7qWRkAxOlz0uCp19rozvefEexFwANU&usqp=CAU"),
            Contacts("Sarah Nash","0718298850","sindet@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsxrCoAoeMIpA1LIJh0r5cd_UgKksCVFeIG3mn8kz2tehCO7sj3Qbvhs77p60BUKsiVf4&usqp=CAU"),
            Contacts("Tabitha Mutinda","0757909080","tabii@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUTMikPFPvS0Mcqm8UAVnWbF5RkIn450CEJw&usqp=CAU"),
            Contacts("Trevor Noah","07895677890","trevornoah@gmail.com","https://pbs.twimg.com/profile_images/1174291945390317568/aDsVwPW8.jpg"),
            Contacts("Swift","07870709-09","swifty@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQi49XO6rO4yyP8KU0-h6FjTjH3Fy2iYn9le6SgddUgWwL_57Nq8LnO5N94_Vw5j8pUDt0&usqp=CAU"),
            Contacts("Spinner","089675453","spiner@kotlin.jetbrains","https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cg_face%2Cq_auto:good%2Cw_300/MTc5ODc0ODg2MzM0ODE4Mjkz/gettyimages-473806450.jpg")
        )

        var coursesAdapter=ContactsAdapter(contactList,baseContext)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter=coursesAdapter

    }
//    private val textWatcher = object : TextWatcher {
//        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//        }
//
//        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//        }
//
//        override fun afterTextChanged(s: Editable?) {
//            filter(s.toString())
//        }
//    }
//    fun filter(editText:String){
////
//        var list2= mutableListOf<Contacts>()
//        for(contacted in contactList){
//            if (editText in contacted.name){
//                list2.add(contacted)
//                println(list2)
//
//            }

//        }

    }
