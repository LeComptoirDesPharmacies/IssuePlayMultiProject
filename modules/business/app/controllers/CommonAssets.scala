package controllers.business

import controllers.Assets.Asset
import controllers.{AssetsBuilder, AssetsMetadata}
import javax.inject.Inject
import play.api.http.DefaultHttpErrorHandler


class CommonAssets @Inject() (errorHandler: DefaultHttpErrorHandler, assetsMetadata: AssetsMetadata) extends AssetsBuilder(errorHandler, assetsMetadata){
  def public (path: String, file: Asset) = versioned(path, file)
  def commonLib (path: String, file: Asset) = versioned(path, file)
  def commonCustomLib (path: String, file: Asset) = versioned(path, file)
  def commonCss (path: String, file: Asset) = versioned(path, file)
  def commonJs (path: String, file: Asset) = versioned(path, file)
  def commonImg (path: String, file: Asset) = versioned(path, file)
}