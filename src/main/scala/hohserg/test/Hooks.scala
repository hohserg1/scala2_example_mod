package hohserg.test

import gloomyfolken.hooklib.api._
import net.minecraft.util.StringUtils
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

@HookContainer
object Hooks {

  @SideOnly(Side.CLIENT)
  @Hook(targetMethod = "ticksToElapsedTime")
  @OnBegin
  def changePotionLabel(stringUtils: StringUtils, ticks: Int): String = {
    val test = 1
    f"$test" //crash
  }

}
