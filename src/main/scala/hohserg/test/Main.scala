package hohserg.test

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = Main.modid, name = "ScalaTest", version = "1.0", modLanguage = "scala")
object Main {
  final val modid = "scala_test"

  val test = 1
  println(f"$test") //doesnt crash

  @EventHandler
  def preInit(f: FMLPreInitializationEvent): Unit = {
  }

}
