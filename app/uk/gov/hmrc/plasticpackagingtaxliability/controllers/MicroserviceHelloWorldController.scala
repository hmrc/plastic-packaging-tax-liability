package uk.gov.hmrc.plasticpackagingtaxliability.controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import uk.gov.hmrc.plasticpackagingtaxliability.config.AppConfig

import scala.concurrent.Future

@Singleton()
class MicroserviceHelloWorldController @Inject()(appConfig: AppConfig, cc: ControllerComponents)
    extends BackendController(cc) {

  def hello(): Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok("Hello world"))
  }
}
