package com.catnip.challange3.data

import com.catnip.challange3.model.DetailMenu


interface MenuDataSource{
    fun getDetailMenu(): List<DetailMenu>
}

class MenuDataSourceImpl() : MenuDataSource {
    override fun getDetailMenu(): List<DetailMenu> = listOf(
        DetailMenu(
            position = 1,
            name = "Burger",
            price = "Rp 15.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Perpaduan antara roti dengan ham yang memiliki cita rasa tiada tara !"
        ),
        DetailMenu(
            position = 2,
            name = "Ayam Goyeng",
            price = "Rp 20.000",
            imgUrl = "https://cdns.klimg.com/resized/1200x600/p/headline/ini-alasan-kenapa-captain-america-dibua-87ae07.jpg",
            desc = "Ayam yang dibalur dengan tepung dan bumbu rempah pilihan khas nusantara"
        ),
        DetailMenu(
            position = 3,
            name = "Dumpling",
            price = "Rp 10.000",
            imgUrl = "https://media.gq-magazine.co.uk/photos/63468efef4f48bee2acb7062/16:9/w_2560%2Cc_limit/Tom-Holland-Spiderman-what-we-know-so-far.jpg",
            desc = "Nama lain Siomay"
        ),
        DetailMenu(
            position = 4,
            name = "Mie Goreng",
            price = "Rp 25.000",
            imgUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/f/f6/Scarlett_Johansson_as_Black_Widow.jpg/220px-Scarlett_Johansson_as_Black_Widow.jpg",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 5,
            name = "Kopi",
            price = "Rp 20.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Kopi yang bikin badan jadi ga ngantuk !"
        ),
        DetailMenu(
            position = 6,
            name = "Kenteng Goreng",
            price = "Rp 15.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = " Kentang Goreng yang digoreng dengan minyak pilihan"
        ),
        DetailMenu(
            position = 7,
            name = "Sate Ayam",
            price = "Rp 15.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Sate ayam seperti biasanya"
        ),
        DetailMenu(
            position = 8,
            name = "Jus Strawberry",
            price = "Rp 15.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Buah strawberry yang diblender dengan air dan susu kental manis"
        ),
        DetailMenu(
            position = 9,
            name = "Sushi",
            price = "Rp 35.000",
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Makanan Orang Jepang"
        )
    )
}
