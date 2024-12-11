package com.example.models.pharmacies

class PharmacyManagement {

    private val pharmacies = mutableListOf(
        Pharmacy(
            "5",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "921543939",
            "21",
            "8",
            1692640800000
        ),
        Pharmacy(
            "4",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Avenida Libertad 45",
            "929609992",
            "31",
            "5",
            1685545200000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Calle Jazmín 5",
            "923274201",
            "9",
            "7",
            1688886000000
        ),
        Pharmacy(
            "3",
            "Farmacia López",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "923542752",
            "25",
            "11",
            1700877600000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Calle Jazmín 5",
            "923274201",
            "9",
            "7",
            1688886000000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Calle Jazmín 5",
            "923274201",
            "9",
            "7",
            1688886000000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Calle Jazmín 5",
            "923274201",
            "9",
            "7",
            1688886000000
        ),
        Pharmacy(
            "1",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "924881229",
            "29",
            "10",
            1698580800000
        ),
        Pharmacy(
            "4",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Avenida Libertad 45",
            "929609992",
            "31",
            "5",
            1685545200000
        ),
        Pharmacy(
            "5",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "921543939",
            "21",
            "8",
            1692640800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "8",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "922158435",
            "14",
            "8",
            1692028800000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "10",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle Olivo 19",
            "921057836",
            "16",
            "6",
            1686949200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "26",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "921027910",
            "4",
            "1",
            1672858800000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "20",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "924118884",
            "11",
            "6",
            1686466800000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "12",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Victoria 14",
            "923176009",
            "5",
            "11",
            1699149600000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "7",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Calle del Sol 8",
            "924225685",
            "18",
            "2",
            1676721600000
        ),
        Pharmacy(
            "5",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle del Sol 8",
            "926995552",
            "5",
            "4",
            1680688800000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "29",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "924250821",
            "29",
            "6",
            1688058000000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "15",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "929342782",
            "8",
            "1",
            1673211600000
        ),
        Pharmacy(
            "13",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "921963830",
            "10",
            "2",
            1676041200000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "21",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "928652546",
            "27",
            "6",
            1687906800000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "25",
            "Farmacia García",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "929386488",
            "9",
            "7",
            1688943600000
        ),
        Pharmacy(
            "2",
            "Farmacia Pérez",
            "De 8:00h a 14:00h",
            "Paseo Marítimo 2",
            "921778962",
            "14",
            "1",
            1673658000000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "24",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Victoria 14",
            "927814070",
            "7",
            "8",
            1691406000000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "6",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Plaza España 12",
            "922781469",
            "30",
            "6",
            1688094000000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "18",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926602324",
            "25",
            "11",
            1700902800000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "1",
            "Farmacia López",
            "De 9:00h a 17:00h",
            "Paseo Marítimo 2",
            "925121138",
            "9",
            "10",
            1696870800000
        ),
        Pharmacy(
            "9",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "922922279",
            "10",
            "3",
            1678446000000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "14",
            "Farmacia García",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "927023391",
            "20",
            "3",
            1679317200000
        ),
        Pharmacy(
            "11",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Luna 16",
            "929189738",
            "18",
            "11",
            1700316000000
        ),
        Pharmacy(
            "3",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Mayor 1",
            "924872917",
            "9",
            "1",
            1673272800000
        ),
        Pharmacy(
            "27",
            "Farmacia Fernández",
            "De 15:00h a 21:00h",
            "Calle Real 23",
            "928561433",
            "3",
            "12",
            1701579600000
        ),
        Pharmacy(
            "23",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Olivo 19",
            "926478851",
            "12",
            "9",
            1694516400000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "17",
            "Farmacia Fernández",
            "De 8:00h a 14:00h",
            "Avenida Libertad 45",
            "929893978",
            "21",
            "10",
            1697896800000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "30",
            "Farmacia Romero",
            "De 8:00h a 14:00h",
            "Calle Mayor 1",
            "928227414",
            "11",
            "8",
            1691751600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "4",
            "Farmacia Fernández",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "926216972",
            "1",
            "8",
            1690909200000
        ),
        Pharmacy(
            "16",
            "Farmacia Romero",
            "De 15:00h a 21:00h",
            "Calle Luna 16",
            "926702962",
            "1",
            "4",
            1680318000000
        ),
        Pharmacy(
            "28",
            "Farmacia Pérez",
            "De 9:00h a 17:00h",
            "Calle Victoria 14",
            "929245917",
            "19",
            "5",
            1684461600000
        ),
        Pharmacy(
            "22",
            "Farmacia García",
            "De 9:00h a 17:00h",
            "Calle Real 23",
            "924110202",
            "7",
            "4",
            1680876000000
        ),
        Pharmacy(
            "19",
            "Farmacia Pérez",
            "De 15:00h a 21:00h",
            "Calle Mayor 1",
            "926729237",
            "23",
            "11",
            1700726400000
        )
    )

    fun findPharmaciesByMonth(month: String?) = pharmacies.filter { it.month == month }
}