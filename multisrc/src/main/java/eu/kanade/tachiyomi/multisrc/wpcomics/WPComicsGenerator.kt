package eu.kanade.tachiyomi.multisrc.wpcomics

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class WPComicsGenerator : ThemeSourceGenerator {

    override val themePkg = "wpcomics"

    override val themeClass = "WPComics"

    override val baseVersionCode: Int = 2

    override val sources = listOf(
        SingleLang("NetTruyen", "https://www.nettruyenclub.com", "vi", overrideVersionCode = 21),
        SingleLang("NhatTruyen", "https://nhattruyenmax.com", "vi", overrideVersionCode = 13),
        SingleLang("TruyenChon", "http://truyenchon.com", "vi", overrideVersionCode = 3),
        SingleLang("XOXO Comics", "https://xoxocomic.com", "en", className = "XoxoComics", overrideVersionCode = 3),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            WPComicsGenerator().createAll()
        }
    }
}
