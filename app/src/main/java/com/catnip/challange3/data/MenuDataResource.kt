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
            price = 15.000,
            imgUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 2,
            name = "Ayam Goyeng",
            price = 20.000,
            imgUrl = "https://cdns.klimg.com/resized/1200x600/p/headline/ini-alasan-kenapa-captain-america-dibua-87ae07.jpg",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 3,
            name = "Dumpling",
            price = 10.000,
            imgUrl = "https://media.gq-magazine.co.uk/photos/63468efef4f48bee2acb7062/16:9/w_2560%2Cc_limit/Tom-Holland-Spiderman-what-we-know-so-far.jpg",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 4,
            name = "Mie Goreng",
            price = 25.000,
            imgUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/f/f6/Scarlett_Johansson_as_Black_Widow.jpg/220px-Scarlett_Johansson_as_Black_Widow.jpg",
            desc = "Makanan Terenak Sejagat Raya"
        )
    )
}
