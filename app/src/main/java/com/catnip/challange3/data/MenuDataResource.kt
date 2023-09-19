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
            imgUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fbakeitwithlove.com%2Fwp-content%2Fuploads%2F2021%2F05%2FMcDonalds-The-Travis-Scott-Burger-sq.jpg&tbnid=3aZ9CUFAZGiEhM&vet=12ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY..i&imgrefurl=https%3A%2F%2Fid.bakeitwithlove.com%2Ftravis-scott-burger%2F&docid=E0GqRA_3Y5HUYM&w=1200&h=1200&q=burger&ved=2ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 2,
            name = "Ayam Goyeng",
            price = 20.000,
            imgUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fbakeitwithlove.com%2Fwp-content%2Fuploads%2F2021%2F05%2FMcDonalds-The-Travis-Scott-Burger-sq.jpg&tbnid=3aZ9CUFAZGiEhM&vet=12ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY..i&imgrefurl=https%3A%2F%2Fid.bakeitwithlove.com%2Ftravis-scott-burger%2F&docid=E0GqRA_3Y5HUYM&w=1200&h=1200&q=burger&ved=2ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 3,
            name = "Dumpling",
            price = 10.000,
            imgUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fbakeitwithlove.com%2Fwp-content%2Fuploads%2F2021%2F05%2FMcDonalds-The-Travis-Scott-Burger-sq.jpg&tbnid=3aZ9CUFAZGiEhM&vet=12ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY..i&imgrefurl=https%3A%2F%2Fid.bakeitwithlove.com%2Ftravis-scott-burger%2F&docid=E0GqRA_3Y5HUYM&w=1200&h=1200&q=burger&ved=2ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY",
            desc = "Makanan Terenak Sejagat Raya"
        ),
        DetailMenu(
            position = 4,
            name = "Mie Goreng",
            price = 25.000,
            imgUrl = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fbakeitwithlove.com%2Fwp-content%2Fuploads%2F2021%2F05%2FMcDonalds-The-Travis-Scott-Burger-sq.jpg&tbnid=3aZ9CUFAZGiEhM&vet=12ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY..i&imgrefurl=https%3A%2F%2Fid.bakeitwithlove.com%2Ftravis-scott-burger%2F&docid=E0GqRA_3Y5HUYM&w=1200&h=1200&q=burger&ved=2ahUKEwjsqYbhpbeBAxV7mWMGHfT0BXcQMygBegQIARBY",
            desc = "Makanan Terenak Sejagat Raya"
        )
    )
}
